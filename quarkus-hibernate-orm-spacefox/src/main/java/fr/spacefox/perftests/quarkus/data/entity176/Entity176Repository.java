package fr.spacefox.perftests.quarkus.data.entity176;

import fr.spacefox.perftests.quarkus.core.port.data.Entity176DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service176.model.Model176;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity176Repository implements Entity176DatasourcePort, PanacheRepository<Entity176> {
    @Override
    public Optional<Model176> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
