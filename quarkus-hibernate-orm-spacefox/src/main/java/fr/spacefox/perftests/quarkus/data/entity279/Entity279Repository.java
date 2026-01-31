package fr.spacefox.perftests.quarkus.data.entity279;

import fr.spacefox.perftests.quarkus.core.port.data.Entity279DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service279.model.Model279;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity279Repository implements Entity279DatasourcePort, PanacheRepository<Entity279> {
    @Override
    public Optional<Model279> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
