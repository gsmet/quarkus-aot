package fr.spacefox.perftests.quarkus.core.service120;

import fr.spacefox.perftests.quarkus.core.port.data.Entity120DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service120.model.Model120;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service120 {

    private final Entity120DatasourcePort datasource;

    public Service120(Entity120DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model120 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
