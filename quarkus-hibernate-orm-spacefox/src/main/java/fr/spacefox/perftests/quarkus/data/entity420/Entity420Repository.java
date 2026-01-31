package fr.spacefox.perftests.quarkus.data.entity420;

import fr.spacefox.perftests.quarkus.core.port.data.Entity420DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service420.model.Model420;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity420Repository implements Entity420DatasourcePort, PanacheRepository<Entity420> {
    @Override
    public Optional<Model420> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
