package io.github.s7i.pgf.grpc;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import io.s7i.pgf.proto.MetadataResponse;
import io.s7i.pgf.proto.MetadataServiceGrpc.MetadataServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class MetadataService extends MetadataServiceImplBase {

    @Override
    public void metadata(Empty request, StreamObserver<MetadataResponse> responseObserver) {
        var r = MetadataResponse.newBuilder()
              .putBundle("status", "well done")
              .build();
        responseObserver.onNext(r);
        responseObserver.onCompleted();
    }
}
