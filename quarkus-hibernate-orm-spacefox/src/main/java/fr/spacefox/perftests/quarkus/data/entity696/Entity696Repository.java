package fr.spacefox.perftests.quarkus.data.entity696;

import fr.spacefox.perftests.quarkus.core.port.data.Entity696DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service696.model.Model696;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity696Repository implements Entity696DatasourcePort, PanacheRepository<Entity696> {
    @Override
    public Optional<Model696> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
