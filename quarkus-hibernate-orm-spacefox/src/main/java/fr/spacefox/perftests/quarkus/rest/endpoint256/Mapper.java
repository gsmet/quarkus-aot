package fr.spacefox.perftests.quarkus.rest.endpoint256;

import fr.spacefox.perftests.quarkus.core.service256.model.Model256;
import fr.spacefox.perftests.quarkus.rest.endpoint256.schema.Schema256;

final class Mapper {
    private Mapper() {}

    public static Schema256 of(Model256 model) {
        return new Schema256(model.id(), model.value());
    }
}
