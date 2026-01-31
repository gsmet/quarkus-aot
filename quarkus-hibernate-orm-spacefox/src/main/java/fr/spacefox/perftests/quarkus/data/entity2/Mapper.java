package fr.spacefox.perftests.quarkus.data.entity2;

import fr.spacefox.perftests.quarkus.core.service2.model.Model2;

final class Mapper {
    private Mapper() {}

    public static Model2 of(Entity2 entity) {
        return new Model2(entity.getId(), entity.getField());
    }
}
