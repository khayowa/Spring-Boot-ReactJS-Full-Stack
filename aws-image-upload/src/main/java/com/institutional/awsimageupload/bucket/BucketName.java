package com.institutional.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("imageuploadfx");
    private final String bucketName;
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
