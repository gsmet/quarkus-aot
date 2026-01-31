package fr.spacefox.perftests.quarkus.rest.endpoint684;

import fr.spacefox.perftests.quarkus.core.service684.model.Model684;
import fr.spacefox.perftests.quarkus.rest.endpoint684.schema.Schema684;

final class Mapper {
    private Mapper() {}

    public static Schema684 of(Model684 model) {
        return new Schema684(model.id(), model.value());
    }
}
