package fr.spacefox.perftests.quarkus.data.entity578;

import fr.spacefox.perftests.quarkus.core.port.data.Entity578DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service578.model.Model578;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity578Repository implements Entity578DatasourcePort, PanacheRepository<Entity578> {
    @Override
    public Optional<Model578> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
