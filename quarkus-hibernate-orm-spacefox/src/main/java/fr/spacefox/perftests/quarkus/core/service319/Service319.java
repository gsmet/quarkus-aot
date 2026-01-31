package fr.spacefox.perftests.quarkus.core.service319;

import fr.spacefox.perftests.quarkus.core.port.data.Entity319DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service319.model.Model319;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service319 {

    private final Entity319DatasourcePort datasource;

    public Service319(Entity319DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model319 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
