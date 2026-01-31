package fr.spacefox.perftests.quarkus.data.entity650;

import fr.spacefox.perftests.quarkus.core.service650.model.Model650;

final class Mapper {
    private Mapper() {}

    public static Model650 of(Entity650 entity) {
        return new Model650(entity.getId(), entity.getField());
    }
}
