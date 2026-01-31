package fr.spacefox.perftests.quarkus.data.entity550;

import fr.spacefox.perftests.quarkus.core.port.data.Entity550DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service550.model.Model550;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity550Repository implements Entity550DatasourcePort, PanacheRepository<Entity550> {
    @Override
    public Optional<Model550> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
