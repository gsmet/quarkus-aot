package fr.spacefox.perftests.quarkus.rest.endpoint830;

import fr.spacefox.perftests.quarkus.core.service830.model.Model830;
import fr.spacefox.perftests.quarkus.rest.endpoint830.schema.Schema830;

final class Mapper {
    private Mapper() {}

    public static Schema830 of(Model830 model) {
        return new Schema830(model.id(), model.value());
    }
}
