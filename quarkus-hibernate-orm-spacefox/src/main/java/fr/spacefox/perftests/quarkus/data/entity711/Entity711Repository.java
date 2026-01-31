package fr.spacefox.perftests.quarkus.data.entity711;

import fr.spacefox.perftests.quarkus.core.port.data.Entity711DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service711.model.Model711;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity711Repository implements Entity711DatasourcePort, PanacheRepository<Entity711> {
    @Override
    public Optional<Model711> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
