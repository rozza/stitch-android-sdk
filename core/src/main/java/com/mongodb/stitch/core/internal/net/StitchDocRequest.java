package com.mongodb.stitch.core.internal.net;

import org.bson.Document;

public final class StitchDocRequest extends StitchRequest {
  public final Document document;

  private StitchDocRequest(final StitchRequest request, final Document document) {
    super(request);
    this.document = document;
  }

  public Builder builder() {
    return new Builder(this);
  }

  public static class Builder extends StitchRequest.Builder {
    private Document document;

    public Builder() {}

    Builder(final StitchDocRequest request) {
      super(request);
      document = request.document;
    }

    @SuppressWarnings("UnusedReturnValue")
    public Builder withDocument(final Document document) {
      this.document = document;
      return this;
    }

    public Document getDocument() {
      return this.document;
    }

    public StitchDocRequest build() {
      return new StitchDocRequest(super.build(), document);
    }
  }
}