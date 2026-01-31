package fr.spacefox.perftests.quarkus.rest.endpoint443;

import fr.spacefox.perftests.quarkus.core.service443.model.Model443;
import fr.spacefox.perftests.quarkus.rest.endpoint443.schema.Schema443;

final class Mapper {
    private Mapper() {}

    public static Schema443 of(Model443 model) {
        return new Schema443(model.id(), model.value());
    }
}
