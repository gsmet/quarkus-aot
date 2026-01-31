package fr.spacefox.perftests.quarkus.rest.endpoint391;

import fr.spacefox.perftests.quarkus.core.service391.model.Model391;
import fr.spacefox.perftests.quarkus.rest.endpoint391.schema.Schema391;

final class Mapper {
    private Mapper() {}

    public static Schema391 of(Model391 model) {
        return new Schema391(model.id(), model.value());
    }
}
