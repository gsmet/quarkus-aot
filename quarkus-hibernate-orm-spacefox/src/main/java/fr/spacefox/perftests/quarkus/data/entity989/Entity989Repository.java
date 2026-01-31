package fr.spacefox.perftests.quarkus.data.entity989;

import fr.spacefox.perftests.quarkus.core.port.data.Entity989DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service989.model.Model989;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity989Repository implements Entity989DatasourcePort, PanacheRepository<Entity989> {
    @Override
    public Optional<Model989> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
