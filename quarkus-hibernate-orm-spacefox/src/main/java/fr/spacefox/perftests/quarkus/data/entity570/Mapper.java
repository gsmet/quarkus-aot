package fr.spacefox.perftests.quarkus.data.entity570;

import fr.spacefox.perftests.quarkus.core.service570.model.Model570;

final class Mapper {
    private Mapper() {}

    public static Model570 of(Entity570 entity) {
        return new Model570(entity.getId(), entity.getField());
    }
}
