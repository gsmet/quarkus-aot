package fr.spacefox.perftests.quarkus.rest.endpoint333;

import fr.spacefox.perftests.quarkus.core.service333.model.Model333;
import fr.spacefox.perftests.quarkus.rest.endpoint333.schema.Schema333;

final class Mapper {
    private Mapper() {}

    public static Schema333 of(Model333 model) {
        return new Schema333(model.id(), model.value());
    }
}
