package fr.spacefox.perftests.quarkus.data.entity536;

import fr.spacefox.perftests.quarkus.core.port.data.Entity536DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service536.model.Model536;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity536Repository implements Entity536DatasourcePort, PanacheRepository<Entity536> {
    @Override
    public Optional<Model536> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
