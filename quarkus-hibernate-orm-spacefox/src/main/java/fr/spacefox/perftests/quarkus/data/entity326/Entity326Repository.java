package fr.spacefox.perftests.quarkus.data.entity326;

import fr.spacefox.perftests.quarkus.core.port.data.Entity326DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service326.model.Model326;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity326Repository implements Entity326DatasourcePort, PanacheRepository<Entity326> {
    @Override
    public Optional<Model326> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
