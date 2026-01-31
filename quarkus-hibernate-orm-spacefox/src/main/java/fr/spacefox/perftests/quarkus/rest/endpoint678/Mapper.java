package fr.spacefox.perftests.quarkus.rest.endpoint678;

import fr.spacefox.perftests.quarkus.core.service678.model.Model678;
import fr.spacefox.perftests.quarkus.rest.endpoint678.schema.Schema678;

final class Mapper {
    private Mapper() {}

    public static Schema678 of(Model678 model) {
        return new Schema678(model.id(), model.value());
    }
}
