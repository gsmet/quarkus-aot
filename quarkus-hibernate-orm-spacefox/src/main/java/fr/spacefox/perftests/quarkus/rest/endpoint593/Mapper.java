package fr.spacefox.perftests.quarkus.rest.endpoint593;

import fr.spacefox.perftests.quarkus.core.service593.model.Model593;
import fr.spacefox.perftests.quarkus.rest.endpoint593.schema.Schema593;

final class Mapper {
    private Mapper() {}

    public static Schema593 of(Model593 model) {
        return new Schema593(model.id(), model.value());
    }
}
