package fr.spacefox.perftests.quarkus.data.entity178;

import fr.spacefox.perftests.quarkus.core.port.data.Entity178DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service178.model.Model178;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity178Repository implements Entity178DatasourcePort, PanacheRepository<Entity178> {
    @Override
    public Optional<Model178> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
