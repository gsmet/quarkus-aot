package fr.spacefox.perftests.quarkus.data.entity206;

import fr.spacefox.perftests.quarkus.core.service206.model.Model206;

final class Mapper {
    private Mapper() {}

    public static Model206 of(Entity206 entity) {
        return new Model206(entity.getId(), entity.getField());
    }
}
