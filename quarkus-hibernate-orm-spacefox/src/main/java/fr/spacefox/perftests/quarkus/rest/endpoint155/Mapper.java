package fr.spacefox.perftests.quarkus.rest.endpoint155;

import fr.spacefox.perftests.quarkus.core.service155.model.Model155;
import fr.spacefox.perftests.quarkus.rest.endpoint155.schema.Schema155;

final class Mapper {
    private Mapper() {}

    public static Schema155 of(Model155 model) {
        return new Schema155(model.id(), model.value());
    }
}
