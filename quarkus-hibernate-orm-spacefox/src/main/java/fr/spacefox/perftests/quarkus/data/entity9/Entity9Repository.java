package fr.spacefox.perftests.quarkus.data.entity9;

import fr.spacefox.perftests.quarkus.core.port.data.Entity9DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service9.model.Model9;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity9Repository implements Entity9DatasourcePort, PanacheRepository<Entity9> {
    @Override
    public Optional<Model9> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
