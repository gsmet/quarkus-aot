package fr.spacefox.perftests.quarkus.data.entity547;

import fr.spacefox.perftests.quarkus.core.port.data.Entity547DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service547.model.Model547;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity547Repository implements Entity547DatasourcePort, PanacheRepository<Entity547> {
    @Override
    public Optional<Model547> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
