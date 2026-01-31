package fr.spacefox.perftests.quarkus.data.entity185;

import fr.spacefox.perftests.quarkus.core.port.data.Entity185DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service185.model.Model185;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity185Repository implements Entity185DatasourcePort, PanacheRepository<Entity185> {
    @Override
    public Optional<Model185> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
