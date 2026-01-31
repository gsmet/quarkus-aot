package fr.spacefox.perftests.quarkus.rest.endpoint945;

import fr.spacefox.perftests.quarkus.core.service945.model.Model945;
import fr.spacefox.perftests.quarkus.rest.endpoint945.schema.Schema945;

final class Mapper {
    private Mapper() {}

    public static Schema945 of(Model945 model) {
        return new Schema945(model.id(), model.value());
    }
}
