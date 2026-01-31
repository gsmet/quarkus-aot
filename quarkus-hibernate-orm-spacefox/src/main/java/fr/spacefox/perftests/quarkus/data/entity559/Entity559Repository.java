package fr.spacefox.perftests.quarkus.data.entity559;

import fr.spacefox.perftests.quarkus.core.port.data.Entity559DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service559.model.Model559;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity559Repository implements Entity559DatasourcePort, PanacheRepository<Entity559> {
    @Override
    public Optional<Model559> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
