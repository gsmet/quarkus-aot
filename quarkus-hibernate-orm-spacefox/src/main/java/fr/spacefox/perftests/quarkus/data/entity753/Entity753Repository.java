package fr.spacefox.perftests.quarkus.data.entity753;

import fr.spacefox.perftests.quarkus.core.port.data.Entity753DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service753.model.Model753;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity753Repository implements Entity753DatasourcePort, PanacheRepository<Entity753> {
    @Override
    public Optional<Model753> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
