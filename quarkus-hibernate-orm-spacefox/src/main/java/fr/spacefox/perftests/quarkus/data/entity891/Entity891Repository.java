package fr.spacefox.perftests.quarkus.data.entity891;

import fr.spacefox.perftests.quarkus.core.port.data.Entity891DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service891.model.Model891;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity891Repository implements Entity891DatasourcePort, PanacheRepository<Entity891> {
    @Override
    public Optional<Model891> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
