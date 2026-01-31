package fr.spacefox.perftests.quarkus.rest.endpoint326;

import fr.spacefox.perftests.quarkus.core.service326.model.Model326;
import fr.spacefox.perftests.quarkus.rest.endpoint326.schema.Schema326;

final class Mapper {
    private Mapper() {}

    public static Schema326 of(Model326 model) {
        return new Schema326(model.id(), model.value());
    }
}
