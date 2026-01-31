package fr.spacefox.perftests.quarkus.rest.endpoint161;

import fr.spacefox.perftests.quarkus.core.service161.model.Model161;
import fr.spacefox.perftests.quarkus.rest.endpoint161.schema.Schema161;

final class Mapper {
    private Mapper() {}

    public static Schema161 of(Model161 model) {
        return new Schema161(model.id(), model.value());
    }
}
