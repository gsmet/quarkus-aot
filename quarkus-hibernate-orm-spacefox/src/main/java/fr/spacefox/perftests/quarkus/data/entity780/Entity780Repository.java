package fr.spacefox.perftests.quarkus.data.entity780;

import fr.spacefox.perftests.quarkus.core.port.data.Entity780DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service780.model.Model780;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity780Repository implements Entity780DatasourcePort, PanacheRepository<Entity780> {
    @Override
    public Optional<Model780> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
