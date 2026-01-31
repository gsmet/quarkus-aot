package fr.spacefox.perftests.quarkus.data.entity920;

import fr.spacefox.perftests.quarkus.core.port.data.Entity920DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service920.model.Model920;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity920Repository implements Entity920DatasourcePort, PanacheRepository<Entity920> {
    @Override
    public Optional<Model920> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
