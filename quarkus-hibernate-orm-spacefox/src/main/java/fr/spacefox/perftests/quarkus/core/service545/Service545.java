package fr.spacefox.perftests.quarkus.core.service545;

import fr.spacefox.perftests.quarkus.core.port.data.Entity545DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service545.model.Model545;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service545 {

    private final Entity545DatasourcePort datasource;

    public Service545(Entity545DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model545 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
