package fr.spacefox.perftests.quarkus.rest.endpoint344;

import fr.spacefox.perftests.quarkus.core.service344.model.Model344;
import fr.spacefox.perftests.quarkus.rest.endpoint344.schema.Schema344;

final class Mapper {
    private Mapper() {}

    public static Schema344 of(Model344 model) {
        return new Schema344(model.id(), model.value());
    }
}
