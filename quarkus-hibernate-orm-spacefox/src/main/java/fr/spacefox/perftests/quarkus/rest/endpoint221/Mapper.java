package fr.spacefox.perftests.quarkus.rest.endpoint221;

import fr.spacefox.perftests.quarkus.core.service221.model.Model221;
import fr.spacefox.perftests.quarkus.rest.endpoint221.schema.Schema221;

final class Mapper {
    private Mapper() {}

    public static Schema221 of(Model221 model) {
        return new Schema221(model.id(), model.value());
    }
}
