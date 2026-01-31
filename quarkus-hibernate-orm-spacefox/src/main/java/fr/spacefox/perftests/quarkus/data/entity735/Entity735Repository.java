package fr.spacefox.perftests.quarkus.data.entity735;

import fr.spacefox.perftests.quarkus.core.port.data.Entity735DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service735.model.Model735;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity735Repository implements Entity735DatasourcePort, PanacheRepository<Entity735> {
    @Override
    public Optional<Model735> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
