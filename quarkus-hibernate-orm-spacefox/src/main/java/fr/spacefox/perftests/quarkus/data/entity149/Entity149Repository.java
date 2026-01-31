package fr.spacefox.perftests.quarkus.data.entity149;

import fr.spacefox.perftests.quarkus.core.port.data.Entity149DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service149.model.Model149;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity149Repository implements Entity149DatasourcePort, PanacheRepository<Entity149> {
    @Override
    public Optional<Model149> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
