package fr.spacefox.perftests.quarkus.rest.endpoint978;

import fr.spacefox.perftests.quarkus.core.service978.model.Model978;
import fr.spacefox.perftests.quarkus.rest.endpoint978.schema.Schema978;

final class Mapper {
    private Mapper() {}

    public static Schema978 of(Model978 model) {
        return new Schema978(model.id(), model.value());
    }
}
