package fr.spacefox.perftests.quarkus.rest.endpoint870;

import fr.spacefox.perftests.quarkus.core.service870.model.Model870;
import fr.spacefox.perftests.quarkus.rest.endpoint870.schema.Schema870;

final class Mapper {
    private Mapper() {}

    public static Schema870 of(Model870 model) {
        return new Schema870(model.id(), model.value());
    }
}
