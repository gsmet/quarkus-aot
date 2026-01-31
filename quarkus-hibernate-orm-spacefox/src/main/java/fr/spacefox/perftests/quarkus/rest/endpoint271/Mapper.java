package fr.spacefox.perftests.quarkus.rest.endpoint271;

import fr.spacefox.perftests.quarkus.core.service271.model.Model271;
import fr.spacefox.perftests.quarkus.rest.endpoint271.schema.Schema271;

final class Mapper {
    private Mapper() {}

    public static Schema271 of(Model271 model) {
        return new Schema271(model.id(), model.value());
    }
}
