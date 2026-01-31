package fr.spacefox.perftests.quarkus.data.entity120;

import fr.spacefox.perftests.quarkus.core.port.data.Entity120DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service120.model.Model120;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity120Repository implements Entity120DatasourcePort, PanacheRepository<Entity120> {
    @Override
    public Optional<Model120> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
