package fr.spacefox.perftests.quarkus.data.entity214;

import fr.spacefox.perftests.quarkus.core.port.data.Entity214DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service214.model.Model214;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity214Repository implements Entity214DatasourcePort, PanacheRepository<Entity214> {
    @Override
    public Optional<Model214> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
