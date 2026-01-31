package fr.spacefox.perftests.quarkus.data.entity716;

import fr.spacefox.perftests.quarkus.core.port.data.Entity716DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service716.model.Model716;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity716Repository implements Entity716DatasourcePort, PanacheRepository<Entity716> {
    @Override
    public Optional<Model716> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
