package fr.spacefox.perftests.quarkus.rest.endpoint742;

import fr.spacefox.perftests.quarkus.core.service742.model.Model742;
import fr.spacefox.perftests.quarkus.rest.endpoint742.schema.Schema742;

final class Mapper {
    private Mapper() {}

    public static Schema742 of(Model742 model) {
        return new Schema742(model.id(), model.value());
    }
}
