package fr.spacefox.perftests.quarkus.core.service536;

import fr.spacefox.perftests.quarkus.core.port.data.Entity536DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service536.model.Model536;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service536 {

    private final Entity536DatasourcePort datasource;

    public Service536(Entity536DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model536 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
