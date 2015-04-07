package com.xcv58.spec.android.utils;

import com.xcv58.spec.scimark2.Constants;
import com.xcv58.spec.scimark2.Random;
import com.xcv58.spec.scimark2.kernel;

/**
 * Created by xcv58 on 4/6/15.
 */
public class Utils {
    public static final String TAG = "SPEC_ANDROID";

    public static final String measureFFT = "measureFFT";
    public static final String measureSOR = "measureSOR";
    public static final String measureMonteCarlo = "measureMonteCarlo";
    public static final String measureSparseMatmult = "measureSparseMatmult";
    public static final String measureLU = "measureLU";

    public static final String[] MEASURE_METHODS = {
            measureFFT,
            measureSOR,
            measureMonteCarlo,
            measureSparseMatmult,
            measureLU
    };

    public static double measure(String method) {
        Random R = new Random(Constants.RANDOM_SEED);

        double min_time = Constants.RESOLUTION_DEFAULT;

        int FFT_size = Constants.FFT_SIZE;
        int SOR_size =  Constants.SOR_SIZE;
        int Sparse_size_M = Constants.SPARSE_SIZE_M;
        int Sparse_size_nz = Constants.SPARSE_SIZE_nz;
        int LU_size = Constants.LU_SIZE;

        // look for runtime options
//        FFT_size = Constants.LG_FFT_SIZE;
//        SOR_size =  Constants.LG_SOR_SIZE;
//        Sparse_size_M = Constants.LG_SPARSE_SIZE_M;
//        Sparse_size_nz = Constants.LG_SPARSE_SIZE_nz;
//        LU_size = Constants.LG_LU_SIZE;


        double result = 0.0;
        switch (method) {
            case measureFFT:
                result = kernel.measureFFT(FFT_size, min_time, R);
                break;
            case measureSOR:
                result = kernel.measureSOR(SOR_size, min_time, R);
                break;
            case measureMonteCarlo:
                result = kernel.measureMonteCarlo(min_time, R);
                break;
            case measureSparseMatmult:
                result = kernel.measureSparseMatmult(Sparse_size_M, Sparse_size_nz, min_time, R);
                break;
            case measureLU:
                result = kernel.measureLU(LU_size, min_time, R);
                break;
            default:
                break;
        }
//        System.out.println("SciMark 2.0a");
        return result;
    }
}
